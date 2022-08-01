import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Informe o nome do arquivo:\n");
        String caminhoArquivo = scanner.nextLine();
        InputStream is = null;
        OutputStream os = null;
        //Buffer de leitura com 1024 bytes
        try {
            is=new FileInputStream(caminhoArquivo);
          os=new FileOutputStream("copia de " +caminhoArquivo);
          byte[]buffer=new byte[1024];
          int length = 0;
          while ((length=is.read(buffer))>0) {
              os.write(buffer, 0, length);
          }
            System.out.println("Copia Efetuada com sucesso");
        } catch (Exception e) {
            System.out.printf("Erro na abertura do arquivo:%s.\n", e.getMessage());
        } finally{
        is.close();
        os.close();
    }
}
}