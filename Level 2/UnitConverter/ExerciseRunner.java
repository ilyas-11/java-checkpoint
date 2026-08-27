
public class ExerciseRunner {

    public static void main(String[] args) {

        System.out.println("212.00 => " +
                UnitConverter.convert(new String[]{"celsius", "fahrenheit", "100"}));

        System.out.println("100.00 => " +
                UnitConverter.convert(new String[]{"fahrenheit", "celsius", "212"}));

        System.out.println("3.11 => " +
                UnitConverter.convert(new String[]{"kilometers", "miles", "5"}));

        System.out.println("8.05 => " +
                UnitConverter.convert(new String[]{"miles", "kilometers", "5"}));

        System.out.println("14.97 => " +
                UnitConverter.convert(new String[]{"pounds", "kilograms", "33"}));

        System.out.println("ERROR => " +
                UnitConverter.convert(new String[]{"pounds", "kilometers", "10"}));

        System.out.println("ERROR => " +
                UnitConverter.convert(new String[]{"pounds", "miles", "10"}));

        System.out.println("ERROR => " +
                UnitConverter.convert(new String[]{"miles", "kilograms", "10"}));

        System.out.println("ERROR => " +
                UnitConverter.convert(new String[]{"celsius", "kilograms", "10"}));

        System.out.println("ERROR => " +
                UnitConverter.convert(new String[]{"miles", "kilometers", "5", "5"}));

        System.out.println("ERROR => " +
                UnitConverter.convert(new String[]{"kilometers", "5"}));

        System.out.println("ERROR => " +
                UnitConverter.convert(new String[]{"miles"}));

        System.out.println("ERROR => " +
                UnitConverter.convert(new String[]{}));

        System.out.println("ERROR => " +
                UnitConverter.convert(new String[]{"celsius", "fahrenheit", "abc"}));
    }
}

