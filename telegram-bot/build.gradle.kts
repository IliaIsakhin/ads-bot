plugins {
    kotlin("jvm")
}

dependencies {
    implementation("io.github.kotlin-telegram-bot.kotlin-telegram-bot:telegram:6.0.1")
}

tasks.withType<org.gradle.jvm.tasks.Jar>() {
    manifest.attributes["Main-Class"] = "ilia.isakhin.ads.bot.telegram.MainKt"
    from(configurations.runtimeClasspath.get().map { if (it.isDirectory) it else zipTree(it) })
}
