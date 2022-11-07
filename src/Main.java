import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    static int fileCounter = 0;
    static int dirCounter = 0;
    public static void main(String[] args) throws IOException {

        // EASY:
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя файла: ");
        String fileName = scanner.nextLine();

        System.out.println("Введите путь к файлу: ");
        String pathName = scanner.nextLine();

        Files.createFile(Paths.get(pathName+fileName));
        System.out.println("создан файл "+pathName+fileName);

        System.out.println("Введите текст: ");
        String input = scanner.nextLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter(pathName+fileName));
        writer.write(input);
        writer.close();
        System.out.println("Well Done!");

        // MEDIUM:

        Cat cat = new Cat();
        System.out.println("Введите имя: ");
        cat.setName(scanner.nextLine());
        System.out.println("Введите возраст: ");
        cat.setAge(scanner.nextInt());
        System.out.println("Введите вес: ");
        cat.setWeight(scanner.nextInt());

        do {
            System.out.println("Выберите номер родословной: ");
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            cat.setNumber(scanner.nextInt());
        }
            while (cat.getNumber() < 1 || cat.getNumber() > 3);

        System.out.println(cat.toString());

        // HARD:

        File path = Path.of("c:\\1").toFile();
        fileCounter(path.listFiles());
        System.out.println("Количество файлов: " + fileCounter);
        System.out.println("Количество директорий: " + dirCounter);
    }

    public static void fileCounter(File[] list) {
        for (File file : list) {
            if (file.isFile() == true) {
                fileCounter++;
            }
            else {
                dirCounter++;
                fileCounter(file.listFiles());
            }
        }
    }
}


