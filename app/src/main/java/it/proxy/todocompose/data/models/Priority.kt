package it.proxy.todocompose.data.models

import androidx.compose.ui.graphics.Color
import it.proxy.todocompose.ui.theme.HighPriorityColor
import it.proxy.todocompose.ui.theme.LowPriorityColor
import it.proxy.todocompose.ui.theme.MediumPriorityColor
import it.proxy.todocompose.ui.theme.NonePriorityColor


enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}