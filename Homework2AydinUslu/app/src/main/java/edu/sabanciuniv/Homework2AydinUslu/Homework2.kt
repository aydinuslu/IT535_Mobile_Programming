package edu.sabanciuniv.Homework2AydinUslu

class Homework2 {
    fun q1(km: Int): Double{
        val miles = km * 0.621371
        return miles
    }
    fun q2(lengthOfRectangle: Int,widthOfRectangle: Int): Int{
        val area = lengthOfRectangle * widthOfRectangle
        return area
    }
    fun q3(n: Int): Int{
        var result = 1
        for (i in 1..n){
            result *= i
        }
        return result
    }
    fun q4(word: String): Int{
        val numberOfEs = word.count { it == 'e' }
        return numberOfEs
    }
    fun q5(numberOfSides: Int): Int{
        val sumOfInteriorAnglesOfPolygon = (numberOfSides - 2) * 180
        val interiorAngleOfPolygon = sumOfInteriorAnglesOfPolygon / numberOfSides
        return interiorAngleOfPolygon
    }
    fun q6(numberOfDaysWorked: Int): Int{
        val numberOfHoursWorked = numberOfDaysWorked * 8
        val monthlyIncome: Int
        if (numberOfHoursWorked <= 150){
            monthlyIncome = numberOfHoursWorked * 40
        }
        else{
            monthlyIncome = (150 * 40) + ((numberOfHoursWorked - 150) * 80)
        }
        return monthlyIncome
    }
    fun q7(parkingTime: Int): Double{
        val parkingFee: Double
        if (parkingTime <= 1){
            parkingFee = 50.0
        }
        else{
            parkingFee = 50.0 + (parkingTime - 1) * 10.0
        }
        return parkingFee
    }
}