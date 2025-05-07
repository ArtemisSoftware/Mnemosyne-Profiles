package com.artemissoftware.mnemosyneprofiles

import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

@Configuration
@Profile("dev")
class DevDiagnostics {
    @Bean
    fun run(): CommandLineRunner {
        return CommandLineRunner { args: Array<String?>? -> println("Hello from dev!") }
    }
}