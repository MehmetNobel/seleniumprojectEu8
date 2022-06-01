package com.cydeo.tests.day9_javaFaker_testbase_driverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {

    @Test
    public void test1() {

        Faker faker = new Faker();

        System.out.println("faker.name().firstName() = " + faker.name().firstName());

        System.out.println("faker.name().lastName() = " + faker.name().lastName());

        System.out.println("faker.address().city() = " + faker.address().city());

        System.out.println("faker.address().secondaryAddress() = " + faker.address().secondaryAddress());

        System.out.println("faker.address() = " + faker.address());

        System.out.println("faker.numerify(\"####.###.####\") = "
                + faker.numerify("###.###.####"));

        System.out.println("faker.number() = " + faker.number());

        System.out.println("faker.phoneNumber() = " + faker.phoneNumber());

        System.out.println("faker.numerify(\"224-###-###\") = " + faker.numerify("224-###-###"));
        //if we wanna give certain number before the random number then we write it first as 224.

        //###.###.###   veya // ###-###-### şeklinde yazabiliriz.

        //  # : to give random number.

        System.out.println("faker.letterify(\"????-????\") = " + faker.letterify("????-????"));

        System.out.println("faker.name().fullName() = " + faker.name().fullName());

        System.out.println("faker.animal() = " + faker.animal());

        System.out.println("faker.business() = " + faker.business());

        System.out.println("faker.job() = " + faker.job());

        System.out.println("faker.bothify(\"??##.??#-###??\") = " + faker.bothify("??##.??#-###??"));

        //we can both get fake number and letters


        // System.out.println("faker.finance().creditCard().replaceAll(\"-\",\"/\") = " + faker.finance().creditCard().replaceAll("-", "/"));

        System.out.println("faker.chuckNorris() = " + faker.chuckNorris());

        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact());

        System.out.println("faker.chuckNorris().fact().replace(\"chuckNorris\",\"muhtar\") = " +
                "" + faker.chuckNorris().fact().replace("Chuck Norris", "muhtar"));

        System.out.println("faker.numerify(\"####-????-####\") = " + faker.numerify("####-????-####"));

        System.out.println("faker.bothify(\"####-????\") = " + faker.bothify("####-????"));

        System.out.println("faker.country() = " + faker.country());

        System.out.println("faker.animal() = " + faker.animal());

        System.out.println("faker.animal().name() = " + faker.animal().name());

        System.out.println("faker.country().name() = " + faker.country().name());

        System.out.println("faker.address().fullAddress() = " + faker.address().fullAddress());

        System.out.println("faker.job().title() = " + faker.job().title());

        System.out.println("faker.finance().iban() = " + faker.finance().iban());


        //System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard());





    }
}
