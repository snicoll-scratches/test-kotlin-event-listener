package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.boot.runApplication
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}

class A {

}

@Component
class ListenerTest {

	@EventListener
	fun onApplicationReady(e: ApplicationReadyEvent): A {
		println(e)
		return A()
	}

}

@Component
class ListenerA {

	@EventListener
	fun onA(e: A) {
		println(e)
	}

}