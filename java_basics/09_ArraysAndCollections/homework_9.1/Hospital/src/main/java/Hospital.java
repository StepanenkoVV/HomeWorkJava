public class Hospital {
    static float minTemptPattinet = 32F;
    static float maxTemptPattient = 40F;
    static float minTemptHealthyPattient = 36.2F;
    static float maxTemptHealthyPattient = 36.9F;


    public static float[] generatePatientsTemperatures(int patientsCount) {
        float[] pattient = new float[patientsCount];
        for (int i = 0; i < pattient.length; i++) {
            pattient[i] = (float) Math.random() * (maxTemptPattient - minTemptPattinet) + minTemptPattinet;
        }

        //TODO: напишите метод генерации массива температур пациентов

        return pattient;
    }

    public static String getReport(float[] temperatureData) {
        /*
        TODO: Напишите код, который выводит среднюю температуру по больнице,количество здоровых пациентов,
            а также температуры всех пациентов.
        */
        String listOfPattients = "";
        String listOfPattients1 = "";
        float avgTempt = 0F;
        int healfyPattients = 0;
        for (float temperature : temperatureData) {
            avgTempt += temperature;
            double temperatureMathRound = Math.round(temperature * 10.0) / 10.0;
            listOfPattients += temperature + " ";
            listOfPattients1 += temperatureMathRound + " ";
            if (temperature >= minTemptHealthyPattient && temperature <= maxTemptHealthyPattient) {
                healfyPattients++;
            }


        }
        avgTempt /= temperatureData.length;
        double avgTemptMathRound = Math.round(avgTempt * 100.0) / 100.0;


        String report =
                "Температуры пациентов: " + listOfPattients1.trim() +
                        "\nСредняя температура: " + avgTemptMathRound +
                        "\nКоличество здоровых: " + healfyPattients;

        return report;
    }
}
