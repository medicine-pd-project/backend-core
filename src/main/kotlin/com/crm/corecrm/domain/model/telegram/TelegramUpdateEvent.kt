package com.crm.corecrm.domain.model.telegram

data class TelegramUpdateEvent(
    val id: Int,
)

data class TelegramUser(
    val tgId: Int,
    val firstName: String,
    val lastName: String,
    val userName: String
)

data class TelegramMessage(
    val messageId: Int,
    val chatId: Int,
    val sender: TelegramUser,
    val text: String,
    val timestamp: Int
)