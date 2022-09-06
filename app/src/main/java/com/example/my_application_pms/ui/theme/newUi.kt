package com.example.my_application_pms.ui.theme

import androidx.compose.foundation.layout.requiredSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.skydoves.landscapist.glide.GlideImage



    @Preview
    @Composable
    fun baseLayout() {

        ConstraintLayout {
            val (cardTitle, transactionTime, iconBrand) = createRefs()

            Text(text = "Belanja", fontSize = 10.sp , fontWeight = FontWeight.Bold, modifier = Modifier.constrainAs(cardTitle){
                top.linkTo(parent.top, margin = 12.dp)
                start.linkTo(iconBrand.end,8.dp)
            })
            Text(text = "15 Mar 2021",fontSize = 10.sp,fontWeight = FontWeight.Normal,modifier = Modifier.constrainAs(transactionTime){
                top.linkTo(cardTitle.bottom)
                start.linkTo(cardTitle.start)
            })



        }
    }

