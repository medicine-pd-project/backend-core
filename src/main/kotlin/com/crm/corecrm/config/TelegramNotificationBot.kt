package com.crm.corecrm.config

import com.crm.corecrm.domain.model.telegram.TelegramMessage
import com.crm.corecrm.domain.model.telegram.TelegramUser
import com.crm.corecrm.service.telegram.TelegramHandlerService
import jakarta.annotation.PostConstruct
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import org.telegram.telegrambots.bots.TelegramLongPollingBot
import org.telegram.telegrambots.meta.api.methods.send.SendMessage
import org.telegram.telegrambots.meta.api.objects.Update
import org.telegram.telegrambots.meta.exceptions.TelegramApiException

@Service
class TelegramNotificationBot(
    @Value("\${telegram.bot.token}") private val botToken: String,
    @Value("\${telegram.bot.name}") private val botName: String,
    private val telegramHandlerService: TelegramHandlerService,
) : TelegramLongPollingBot(botToken) {

    @PostConstruct
    fun t() {
        println("Token : $botToken")
    }

    private val LOG = LoggerFactory.getLogger(TelegramNotificationBot::class.java)

    override fun getBotToken(): String = botToken

    override fun getBotUsername(): String = botName

    override fun onUpdateReceived(update: Update) {
        val tgChatId = update.message.chatId.toInt()
        val tgChat = update.message.chat

        val sender = TelegramUser(
            tgId = tgChatId,
            firstName = tgChat.firstName ?: "",
            lastName = tgChat.lastName ?: "",
            userName = tgChat.userName ?: "",
        )

        val telegramMessage = TelegramMessage(
            messageId = 0, // Initial value before being saved
            chatId = tgChatId,
            sender = sender,
            text = update.message.text,
            timestamp = update.message.date
        )
        LOG.info("Received message: $telegramMessage")
        telegramHandlerService.handleIncomingMessage(telegramMessage)
    }

    fun sendMessage(chatId: Int, message: String) {
        val sendMessage = SendMessage.builder()
            .chatId(chatId.toString())
            .text(message)
            .build()

        try {
            execute(sendMessage)
        } catch (e: TelegramApiException) {
            LOG.error("Error occurred while sending message: {}", e.message)
        }
    }
}

enum class PreferredContact {
    TELEGRAM,
}