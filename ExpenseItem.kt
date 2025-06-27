package com.example.budgettracker

import java.util.Date

data class ExpenseItem(
    val amount: Double,
    val category: String,
    val description: String,
    val expenseName: String,
    val date: Date ,
    val imageUri: String?
)
