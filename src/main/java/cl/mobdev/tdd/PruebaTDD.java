package cl.mobdev.tdd;

// Método que recibirá un input (tipo int) y retornará un String de su mismo valor
// pero si este input es un múltiplo de 3 retornará Fizz
// y si este input es múltiplo de 5 retornará Buzz
// en caso de que el input sea múltiplo de 3 y 5 retornará FizzBuzz

public class PruebaTDD {
    public String convert(int input) {

        if (input % 3 == 0 && input % 5 == 0) {
            return "FizzBuzz";
        } else if (input % 3 == 0) {
            return "Fizz";
        } else if (input % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(input);
    }
}