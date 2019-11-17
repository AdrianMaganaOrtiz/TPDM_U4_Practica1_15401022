package mx.edu.ittepic.tpdm_u4_practica1_15401022

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.os.Build
import android.view.View
import androidx.annotation.RequiresApi

class Lienzo(p: MainActivity): View(p){
    val imagen = BitmapFactory.decodeResource(resources,R.drawable.il)
    val imagen2 = BitmapFactory.decodeResource(resources,R.drawable.san)
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onDraw(c: Canvas) {
        super.onDraw(c)
        val p = Paint()

        setBackgroundColor(Color.BLACK)//blackground
        c.drawBitmap(imagen,1000f,200f,p) //luz
        p.color = Color.rgb(255,255,255)
        c.drawCircle(100f, 1900f, 1500f, p) //motañaIZQ
        c.drawCircle(2100f, 1950f, 1350f, p)//montañaDER
        //casa
        p.color = Color.BLACK
        c.drawRect(90f,1000f,500f,1100f,p)
        p.color = Color.GRAY
        c.drawRect(110f,1100f,485f,1294f,p)
        p.color = Color.rgb(59,31,6)
        c.drawRect(190f,1170f,275f,1293f,p)
        p.color = Color.BLACK
        c.drawRect(320f,1170f,400f,1245f,p)
        //casa 2
        p.style = Paint.Style.FILL
        p.color = Color.BLACK
        c.drawRect(590f,1000f,1000f,1100f,p)
        p.color = Color.MAGENTA
        c.drawRect(610f,1100f,985f,1294f,p)
        p.color = Color.rgb(59,31,6)
        c.drawRect(690f,1170f,775f,1293f,p)
        p.color = Color.rgb(255,198,0)
        c.drawRect(820f,1170f,890f,1245f,p)
        //arbol 1
        p.style = Paint.Style.FILL
        p.color = Color.rgb(142,112,76)//cafe tronco arbol
        c.drawRect(230f,800f,270f,940f,p)
        p.color = Color.rgb(4,78,4)//hojas arbol
        c.drawOval(115f,800f,385f,860f,p)
        c.drawOval(130f,750f,370f,830f,p)
        c.drawOval(160f,700f,340f,800f,p)
        c.drawOval(190f,650f,300f,770f,p)
        //arbol 2
        p.color = Color.rgb(142,112,76)//cafe tronco arbol
        c.drawRect(630f,700f,670f,840f,p)
        p.color = Color.rgb(4,78,4)//hojas arbol
        c.drawOval(515f,700f,785f,760f,p)
        c.drawOval(530f,650f,770f,730f,p)
        c.drawOval(560f,600f,740f,700f,p)
        c.drawOval(600f,550f,700f,670f,p)
        //arbol 3
        p.color = Color.rgb(142,112,76)//cafe tronco arbol
        c.drawRect(2130f,1165f,2170f,1305f,p)
        p.color = Color.rgb(4,78,4)//hojas arbol
        c.drawOval(2015f,1165f,2285f,1105f,p)//base
        c.drawOval(2030f,1115f,2270f,1075f,p)//base2
        c.drawOval(2050f,1030f,2250f,1080f,p)//base3
        c.drawOval(2090f,990f,2210f,1040f,p)//base4
        c.drawOval(2120f,950f,2170f,1000f,p)//base5
        //SANTA
        c.drawBitmap(imagen2,1600f,1160f,p)
        //estrellas
        p.color = Color.rgb(255,255,255)
        p.style = Paint.Style.FILL
        c.drawCircle(10f, 120f, 8f, p)
        c.drawCircle(370f, 110f, 8f, p)
        c.drawCircle(530f, 115f, 8f, p)
        c.drawCircle(750f, 97f, 8f, p)
        c.drawCircle(1120f, 105f, 8f, p)
        c.drawCircle(1760f, 93f, 8f, p)
        c.drawCircle(1920f, 100f, 8f, p)
        c.drawCircle(2370f, 120f, 8f, p)
        c.drawCircle(210f, 220f, 8f, p)
        c.drawCircle(860f, 230f, 8f, p)
        c.drawCircle(1020f, 210f, 8f, p)
        c.drawCircle(1480f, 195f, 8f, p)
        c.drawCircle(2040f, 200f, 8f, p)
        c.drawCircle(2270f, 215f, 8f, p)
        c.drawCircle(760f, 410f, 8f, p)
        c.drawCircle(1320f, 490f, 8f, p)
        c.drawCircle(1730f, 460f, 8f, p)
        c.drawCircle(2160f, 430f, 8f, p)
        c.drawCircle(1010f, 520f, 8f, p)
        c.drawCircle(1690f, 500f, 8f, p)
        c.drawCircle(2240f, 490f, 8f, p)
        c.drawCircle(1120f, 760f, 8f, p)
        c.drawCircle(1740f, 730f, 8f, p)
        c.drawCircle(2110f, 720f, 8f, p)
        c.drawCircle(1650f, 800f, 6f, p)
        c.drawCircle(2050f, 800f, 6f, p)
    }
}