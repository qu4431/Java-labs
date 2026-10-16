void main() {
    int number = Integer.parseInt(IO.readln("Enter a number: "));
    IO.println("Binary: " + Converter.convert(number, 2));
    IO.println("Octal: " + Converter.convert(number, 8));
    IO.println("Hexadecimal: " + Converter.convert(number, 16));
}
