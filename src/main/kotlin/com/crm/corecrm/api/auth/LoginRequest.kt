package com.crm.corecrm.api.auth

data class LoginRequest(
    val login: String,
    val password: String,
)
