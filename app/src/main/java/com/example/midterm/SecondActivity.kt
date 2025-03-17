package com.example.midterm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.layout.ContentScale
import androidx.compose.foundation.background
import androidx.compose.ui.graphics.Color

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DetailScreen { finish() }
        }
    }
}

@Composable
fun DetailScreen(onBack: () -> Unit) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.back),
            contentDescription = "Фон",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Box(
                modifier = Modifier
                    .background(Color.White.copy(alpha = 0.7f)) // Полупрозрачный белый фон
                    .padding(16.dp) // Отступы внутри фона
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(
                        text = "Обо мне",
                        fontSize = 24.sp,
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(
                        text = "Я увлекаюсь программированием, особенно в области Digital Engineering, статистики и Data Science. Работаю с Python, C++ и Java, занимаюсь машинным обучением и аналитикой данных. Мне нравится разбираться в сложных системах, строить прогнозные модели и визуализировать информацию с помощью Power BI и Excel.  \n" +
                                "\n" +
                                "Недавно начал изучать язык программирования Go — хочу прокачать навыки в бэкенд-разработке и параллельных вычислениях. В рамках учёбы и работы активно использую Spring Boot, MEAN-стек и различные фреймворки.  \n" +
                                "\n" +
                                "Кроме программирования, я интересуюсь фитнесом. Сейчас работаю над набором массы, регулярно тренируюсь в зале, включаю базовые упражнения (жим, присед, становая), подбираю оптимальную программу тренировок и питания.  \n" +
                                "\n" +
                                "Также у меня есть творческая сторона — я создаю брендбуки и работаю с дизайном в Figma. Один из недавних проектов — фирменный стиль компании Nexify, которая внедряет ИИ в бизнес.  \n" +
                                "\n" +
                                "Помимо этого, мне нравится изучать бизнес-аналитику и финансы. Недавно разбирался с финансовым моделированием на примере Air Astana, анализировал устойчивость компании и делал прогнозы.  \n" +
                                "\n" +
                                "Ещё я администратор в барбершопе. Погружаюсь в процессы управления, маркетинга и продаж. В целом, мне нравится развиваться в нескольких направлениях, искать новые вызовы и находить нестандартные решения.",
                        textAlign = TextAlign.Center
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = onBack) {
                Text(text = "Назад")
            }
        }
    }
}
