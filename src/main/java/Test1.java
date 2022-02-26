public class Test1 {
    public static void main(String[] args) {
String[] mass = {"Пренебрежение в стратегии", "Принебрежение в стратегии", "Птички летают на юг",
        "Жизнь в удовольствие", "Пренебрежение в стратегии"};
int[] sum = new int[mass.length];
int count = 0;
for (int j = 0; j < mass.length; j++) {
    for (int i = 0; i < mass.length; i++) {
        if (mass[j].equals(mass[i])) {
            sum[j]++;
        }
    }
}

int z = 0;
int maxNum = sum[0];
for (int j = 0; j < mass.length; j++) {
    if (sum[j] > maxNum)
        maxNum = sum[j];
        z = j;
}
        System.out.println("Наиболее повторяющейся строка является: " + mass[z]);

        int counts = 0;

        if(mass[z].length() != 0){
            count++;
            for (int i = 0; i < mass[z].length(); i++) {
                if(mass[z].charAt(i) == ' '){
                    count++;
                }
            }
        }

        System.out.println("Количество слов с строке сстовляет " + count);
    }
}
