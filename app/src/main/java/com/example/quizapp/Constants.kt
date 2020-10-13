package com.example.quizapp

object Constants {

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.argentina,
            "Argentina",
            "Australia",
            "Armenia",
            "Austria",
            1
        )
        questionsList.add(que1)


        val que2 = Question(
            2, "What country does this flag belong to?",
            R.drawable.australia,
            "Angola", "Austria",
            "Australia", "Armenia", 3
        )

        questionsList.add(que2)

        val que3 = Question(
            3, "What country does this flag belong to?",
            R.drawable.brazil,
            "Brazil", "Denmark", "RepúblicaCheca",
            "Tayland", 1
        )

        questionsList.add(que3)

        val que4 = Question(
            4, "What country does this flag belong to?",
            R.drawable.germany,
            "Angola", "Belgium", "Japan",
            "Germany", 4
        )

        questionsList.add(que4)

        val que5 = Question(
            5, "What country does this flag belong to?",
            R.drawable.india,
            "Afghanistan", "Cambodia", "Colombia",
            "India", 4
        )

        questionsList.add(que5)

        val que6 = Question(
            6, "What country does this flag belong to?",
            R.drawable.kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )
        questionsList.add(que6)

        val que7 = Question(
            7, "What country does this flag belong to?",
            R.drawable.denmark,
            "Dominica", "Egypt",
            "Denmark", "Ethiopia", 3
        )
        questionsList.add(que7)

        val que8 = Question(
            8, "What country does this flag belong to?",
            R.drawable.newzeland,
            "Australia", "New Zealand",
            "Tuvalu", "EUA", 2
        )
        questionsList.add(que8)

        val que9 = Question(
            9, "What country does this flag belong to?",
            R.drawable.belgium,
            "Germany", "México",
            "Mongolia", "Belgium", 4
        )
        questionsList.add(que9)

        val que10 = Question(
            10, "What country does this flag belong to?",
            R.drawable.fiji,
            "Fiji", "Maldives", "China",
            "Sweden", 1
        )
        questionsList.add(que10)

         return questionsList
    }


}