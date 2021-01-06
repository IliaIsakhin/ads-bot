package ilia.isakhin.ads.bot.telegram

import com.github.kotlintelegrambot.bot
import com.github.kotlintelegrambot.dispatch
import com.github.kotlintelegrambot.dispatcher.text
import com.github.kotlintelegrambot.logging.LogLevel

fun main() {
    val bot = bot {
        logLevel = LogLevel.All()
        token = System.getenv("private_token")

        dispatch {
            text {
                bot.sendMessage(chatId = message.chat.id, text = "Даров")
            }
        }
    }

    bot.startPolling()
}