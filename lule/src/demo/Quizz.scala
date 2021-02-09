package demo
import scala.io.StdIn.readLine
import java.math.MathContext

object Quizz {

  def start() = {

    var summa = 0
    var guess1 = readLine(""" I villket spel kan man raida, battla och levla?
                    1.Kung Fu Pets
                    2.Pokemon GO
                    3.SuperMario
                    Svar: """)

    if (guess1 == "2") {
      summa = summa + 1
      println("rätt")
    } else {
      println("Fel")
    }

    val guess2 = readLine(""" Vilket djur kan man inte se i Sverige
                     1.Älg
                     2.Räv
                     3.Skunk
                     Svar: """)

    if (guess2 == "3") {
      summa = summa + 1
      println("rätt")
    } else {
      println("fel")
    }

    val guess3 = readLine(
      """Vad heter den äventyrssökande 16-åriga Disneytjej som ger sig ut på havet för att finna halvguden Maui
                    1.Jasmin
                    2.Vaiana
                    3.Lilo 
                    Svar: """
    )

    if (guess3 == "2") {
      summa = summa + 1
      println("Rätt")
    } else {
      println("Fel")
    }

    val guess4 = readLine(
      """Vilket av Sveriges 3 landsdelar är störst till ytan?
                    1.Svealand
                    2.Norrland
                    3.Götaland
                    Svar: """
    )

    if (guess4 == "2") {
      summa = summa + 1
      println("Rätt")
    } else {
      println("Fel")
    }

    val guess5 = readLine(
      """FIFA och NHL är populära TV- och datorspel, vad spelar man i spelen?
                    1.Fotboll och Hockey
                    2.Fotboll och Basket
                    3.Tennis och Hockey
                    Svar: """
    )

    if (guess5 == "1") {
      summa = summa + 1
      println("Rätt")
    } else {
      println("Fel")
    }

    val guess6 = readLine(
      """Vad heter tv-serien där vi får följa Twilight Sparkle,Pinkie Pie,Rainbow Dash och draken Spike?
                    1.My little pony
                    2.Vampyrskolan
                    3.Digimon
                    Svar: """
    )

    if (guess6 == "1") {
      summa = summa + 1
      println("Rätt")
    } else {
      println("Fel")
    }

    val guess7 = readLine("""Vilka färger har Danmarks flagga?
                    1.Gul och Blå
                    2.Blå. Röd och Vit
                    3.Röd och Vit
                    Svar: """)

    if (guess7 == "3") {
      summa = summa + 1
      println("Rätt")
    } else {
      println("Fel")
    }

    val guess8 = readLine(
      """Vad heter appen där foton som skickas och delas bara får ses en kort stund?
                    1.Whatsapp
                    2.Snapchat
                    3.Instagram
                    Svar: """
    )

    if (guess8 == "2") {
      summa = summa + 1
      println("Rätt")
    } else {
      println("Fel")
    }

    val guess9 = readLine("""Vem är känd som "Världens mesta häst"?
                    1.Mulle
                    2.Pegasus
                    3.Lilla gubben
                    Svar: """)

    if (guess9 == "1") {
      summa = summa + 1
      println("Rätt")
    } else {
      println("Fel")
    }

    val guess10 = readLine(
      """DualDgaming är en Youtube-kanal där David och Danne visar klipp där de spelar Minecraft och GTA 5. Vad kallar sig David när han lägger upp sina klipp?
                    1.CrafterPX
                    2.Troll24
                    3.Ufosxm
                    Svar: """
    )

    if (guess10 == "3") {
      summa = summa + 1
      println("Rätt")
    } else {
      println("Fel")
    }

    val guess11 = readLine(
      """Vad heter den vätska som rinner ur träd när de blir skadade?
                    1.Kåda
                    2.Sirap
                    3.Juice
                    Svar: """
    )

    if (guess11 == "1") {
      summa = summa + 1
      println("Rätt")
    } else {
      println("Fel")
    }
    val guess12 = readLine("""I vilket lag spelar Zlatan Ibrahimovic?.
                    1.Manchester United
                    2.Paris SG
                    3.LA Galaxy
                    Svar: """)

    if (guess12 == "3") {
      summa = summa + 1
      println("Rätt")
    } else {
      println("Fel")
    }

    println(s"$summa/12 Rätt")

  }

}
