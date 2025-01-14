package com.example.portifolio

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Surface
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType.Companion.Uri
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import com.example.portifolio.ui.theme.PortifolioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PortifolioTheme {
                Inicio()
            }
        }
    }

}




@Composable
fun Inicio() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF0F172A))
            .verticalScroll(state = rememberScrollState())

    ) {
        Box(
            Modifier
                .padding(top = 60.dp)
                .align(Alignment.CenterHorizontally)
        ) {
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color.Transparent
                ),
                modifier = Modifier
                    .size(150.dp)
                    .offset(y = 10.dp, x = 10.dp)
                    .clip(shape = RoundedCornerShape(5.dp))
                    .border(3.dp, Color(0xFF5CEACB), shape = RoundedCornerShape(5.dp))
            ) {

            }

            Image(
                painter = painterResource(id = R.drawable.foto_maykon__1_),
                contentDescription = "Foto",
                modifier = Modifier
                    .size(150.dp)
                    .clip(shape = RoundedCornerShape(5.dp))
            )


        }

        Column(
            Modifier
                .padding(22.dp)
                .padding(top = 20.dp)
        ) {

            Text(
                "Olá, meu nome é",
                fontSize = 17.sp,
                fontWeight = FontWeight.Medium,
                color = Color(0xFF5CEACB),
            )

            Text(
                "Maykon Silva",
                fontSize = 55.sp,
                fontWeight = FontWeight.Medium,
                color = Color.White,
            )

            Text(
                "Desenvolvedor Mobile - Kotlin ",
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.White,
            )
            Spacer(modifier = Modifier.padding(top = 10.dp))

            Text(
                "Eu crio experiências digitais acessíveis para dispositivos mobile e para a web.",
                fontSize = 15.sp,
                fontWeight = FontWeight.Normal,
                color = Color.White,
            )


            Row(
                Modifier
                    .padding(top = 20.dp)
                    .widthIn(200.dp, 400.dp)
                    .align(Alignment.CenterHorizontally),
                horizontalArrangement = Arrangement.SpaceEvenly,
            ) {

                Image(
                    painter = painterResource(id = R.drawable.vector),
                    contentDescription = "Github",
                    modifier = Modifier
                        .size(25.dp)
                        .clickable { }

                )
                Image(
                    painter = painterResource(id = R.drawable.vector__1_),
                    contentDescription = "LinkedIn",
                    modifier = Modifier.size(25.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.group),
                    contentDescription = "Instagram",
                    modifier = Modifier.size(25.dp)
                )

            }

        }

        Column(
            Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 10.dp)
        ) {

            Text(
                "SOBRE",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                textAlign = TextAlign.Center
            )
        }

        Column(
            Modifier.padding(22.dp)
        ) {
            Text(
                "Sou um desenvolvedor apaixonado por criar interfaces de usuário acessíveis e perfeitas em pixels que combinam design inteligente com engenharia robusta.\n\nMeu trabalho favorito está na intersecção de design e desenvolvimento, criando experiências que não só têm uma ótima aparência, mas são meticulosamente construídas para desempenho e usabilidade.\n\nMeu interesse em desenvolvimento web começou em 2021, quando decidi assistir a vídeos sobre inteligência artificial e como uma rede neural funcionava, explorando conceitos ao estudar o funcionamento do Jogo do Chrome.\n\nAvançando para hoje, estou cursando Analise e Desenvolvimento de sistemas e tive o privilégio de trabalhar em um projeto chamado DevEmpower no Instituto PROA, um programa que capacita desenvolvedores para o mercado de trabalho, ajudando no desenvolvimento de soft skills. O projeto inclui aulas interativas, quizzes e uma comunidade que promove o engajamento dos usuários, incentivando seu crescimento contínuo.\n\nNo meu tempo livre, geralmente estou na academia, lendo, saindo com minha namorada para conhecer novos lugares, ou correndo no parque.",
                fontSize = 17.sp,
                fontWeight = FontWeight.Normal,
                color = Color(0xFF93A2B8),
            )

        }

        Column(
            Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 10.dp)
        ) {

            Text(
                "EXPERIÊNCIA",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                textAlign = TextAlign.Center
            )
        }


        Spacer(modifier = Modifier.padding(top = 10.dp))

        CardItem(
            "JUN - DEZ 2024",
            "Desenvolvedor Front-end Mobile  •  DevEmpower  ",
            "Trabalhei na criação e na personalização de componentes importantes para o frontend do DevEmpower, contribuindo bastante para o desenvolvimento da plataforma. Colaborei de perto com a equipe, incluindo desenvolvedores, designers e gerentes de produto, para implementar e garantir as melhores práticas, criando uma plataforma acessível e fácil de usar para todos."
        )


        CardPro(
            "2021 - 2024",
            "Embalador a mão  •  Faca São Paulo  ",
            "Produzindo facas para os setores de brindes, artesanatos e expositores. Há também uma gama muito grande no setor de embalagens, onde os designers criam seus projetos afim de impulsionar"
        )


        CardPro(
            "MAR - DEZ 2019",
            "Assistente administrativo  •  TJSP  ",
            "Como assistente no TJSP, organizei processos, atendi público e advogados, redigi documentos oficiais e controlei prazos. Aprendi sobre o sistema judicial e desenvolvi organização e atenção aos detalhes."
        )

        Box(
            Modifier
                .padding(20.dp)
                .clip(shape = RoundedCornerShape(25.dp))
                .width(256.dp)
                .height(48.dp)
                .background(Color(0xFF17233E))
                .align(Alignment.CenterHorizontally)
        ) {
            Row(
                Modifier
                    .wrapContentWidth()
                    .align(Alignment.Center),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    "Ver currículo completo",
                    fontSize = 17.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.White,
                )

                Spacer(modifier = Modifier.padding(end = 10.dp))

                Image(
                    painter = painterResource(id = R.drawable.white_arrow),
                    contentDescription = "Seta",
                    modifier = Modifier
                        .size(12.dp)
                )

            }

        }

        Column(
            Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 10.dp)
        ) {
            Text(
                "PROJETOS",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                textAlign = TextAlign.Center
            )
        }

        CardProject("Eu Escolho Você",
            1,
            "Eu Escolho Você é um app Android que ajuda a decidir filmes, perguntas ou pratos de forma divertida e interativa. Com sorteios aleatórios e uma interface moderna, torna decisões rápidas mais leves."
        )

        CardProject(
            "AlgebrApp",
            2,
            "AlgebrApp é uma calculadora geométrica Android que facilita o cálculo de áreas e perímetros de diversas formas. Desenvolvido com Jetpack Compose, oferece uma interface intuitiva e moderna para usuários."
        )

        CardProject(
            "DevEmpower",
            3,
            "A DevEmpower é uma plataforma inovadora que capacita desenvolvedores, focando tanto em soft skill quanto em habilidades técnicas, preparando-os para enfrentar os desafios reais do mercado de trabalho de forma acessível e interativa."
        )

        Box(
            Modifier.padding(40.dp).padding(top = 10.dp, end = 10.dp).background(Color(0xFF0F172A))
        ){
            Row (
                Modifier
                    .wrapContentWidth()
                    .align(Alignment.Center),
                verticalAlignment = Alignment.CenterVertically
            ){
                Text(
                    "Prototipo feito no Figma e codificado em Android Studio por mim. Construído com Kotlin usando a ferramenta Jetpack Compose. Todo o texto é definido na fonte Roboto.",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Center,
                    color = Color(0xFF566787),
                )

            }
        }

    }
}

@Composable
fun CardItem(data: String, text: String, sobre: String) {

    Box(
        Modifier
            .padding(top = 16.dp, start = 20.dp, end = 20.dp)
            .clip(shape = RoundedCornerShape(10.dp))
            .fillMaxWidth()
            .wrapContentHeight()
            .background(Color(0xFF17233E))

    ) {
        Column {
            Column(
                modifier = Modifier
                    .padding(12.dp)
            ) {

                Text(
                    text = data,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color(0xFF93A2B8),

                    )

                Spacer(modifier = Modifier.padding(top = 10.dp))

                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = text,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color(0xFF5CEACB),
                    )

                    Image(
                        painter = painterResource(id = R.drawable.seta_green),
                        contentDescription = "Seta",
                        modifier = Modifier
                            .size(10.dp)
                    )

                }

                Spacer(modifier = Modifier.padding(top = 10.dp))

                Text(
                    text = sobre,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color(0xFF93A2B8)
                )

                Spacer(modifier = Modifier.padding(top = 10.dp))

            }
            Column(
                Modifier.align(Alignment.CenterHorizontally)
            ) {
                Row {
                    Linguagem("Kotlin")
                    Spacer(modifier = Modifier.padding(end = 10.dp))
                    Linguagem("NoSql")
                    Spacer(modifier = Modifier.padding(end = 10.dp))
                    Linguagem("Figma")

                }

                Spacer(modifier = Modifier.padding(top = 10.dp))

                Row {
                    Linguagem("Trello")
                    Spacer(modifier = Modifier.padding(end = 10.dp))
                    Linguagem("Git")
                    Spacer(modifier = Modifier.padding(end = 10.dp))
                    Linguagem("Android")
                }

                Spacer(modifier = Modifier.padding(10.dp))
            }
        }


    }

}

@Composable
fun CardPro(data: String, text: String, sobre: String) {

    Box(
        Modifier
            .padding(top = 16.dp, start = 20.dp, end = 20.dp)
            .clip(shape = RoundedCornerShape(10.dp))
            .fillMaxWidth()
            .wrapContentHeight()
            .background(Color(0xFF17233E))

    ) {
        Column {
            Column(
                modifier = Modifier
                    .padding(12.dp)
            ) {

                Text(
                    text = data,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color(0xFF93A2B8),

                    )

                Spacer(modifier = Modifier.padding(top = 10.dp))

                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = text,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color(0xFF5CEACB),
                    )

                    Image(
                        painter = painterResource(id = R.drawable.seta_green),
                        contentDescription = "Seta",
                        modifier = Modifier
                            .size(10.dp)
                    )

                }

                Spacer(modifier = Modifier.padding(top = 10.dp))

                Text(
                    text = sobre,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color(0xFF93A2B8)
                )

                Spacer(modifier = Modifier.padding(top = 10.dp))

            }

        }


    }

}


@Composable
fun Linguagem(text: String) {

    Box(
        Modifier
            .clip(shape = RoundedCornerShape(30.dp))
            .background(Color(0xFF193753))
            .widthIn(95.dp, 120.dp)
            .height(30.dp)

    ) {
        Text(
            text = text,
            fontSize = 15.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color(0xFF5CEACB),
            modifier = Modifier.align(Alignment.Center)
        )

    }
}

@Composable
fun CardProject(text: String, fotos_project: Int, descri: String) {
    var fotos_project = fotos_project

        Box(
            Modifier
                .padding(top = 16.dp, start = 20.dp, end = 20.dp)
                .clip(shape = RoundedCornerShape(10.dp))
                .fillMaxWidth()
                .wrapContentHeight()
                .background(Color(0xFF17233E))
        ) {
            Column(
                modifier = Modifier
                    .padding(12.dp)
            ) {
                Row(
                    Modifier
                        .wrapContentWidth()
                        .offset(y = 15.dp)
                        .align(Alignment.CenterHorizontally),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = text,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color(0xFF5CEACB)
                    )

                    Spacer(modifier = Modifier.padding(end = 10.dp))

                    Image(
                        painter = painterResource(id = R.drawable.seta_green),
                        contentDescription = "Seta",
                        modifier = Modifier
                            .size(12.dp)
                    )
                }

               var imagem = when (fotos_project) {
                    1 -> R.drawable.mockup_eevc
                    2 -> R.drawable.logo_algebr
                    else -> R.drawable.logo_dev
                }

                Image(
                    painter = painterResource(id = imagem),
                    contentDescription = "Imagem dos Projetos",
                    modifier = Modifier
                        .width(150.dp)
                        .height(300.dp)
                        .align(Alignment.CenterHorizontally)
                )

                Text(
                    text = descri,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Center,
                    color = Color(0xFF93A2B8),
                    modifier = Modifier
                        .offset(y = (-20).dp)
                )
            }
        }
}


@Preview(showBackground = true)
@Composable
fun Preview() {
    PortifolioTheme {
        Inicio()
    }
}