package com.example.to_docompose.data.models

import androidx.compose.ui.graphics.Color
import com.example.to_docompose.ui.theme.HighPriorityColor
import com.example.to_docompose.ui.theme.LowPrioriTyColor
import com.example.to_docompose.ui.theme.MediumPriorityColor
import com.example.to_docompose.ui.theme.NonePriorityColor


enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPrioriTyColor),
    NONE(NonePriorityColor)
}