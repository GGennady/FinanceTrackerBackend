package com.ggennady.finance_tracker_backend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FinanceTrackerBackendApplication

fun main(args: Array<String>) {
	runApplication<FinanceTrackerBackendApplication>(*args)
}
