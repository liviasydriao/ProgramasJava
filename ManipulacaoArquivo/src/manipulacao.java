import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;
//-----------------------------------------------------------

public class manipulacao {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        // MENU:
        String op = "s";

        while(!op.equals("n")) {
            System.out.println("*---------------*- MENU -*---------------*\nDigite:\n1 - Criar arquivo\n2 - Cadastrar\n3 - Ler arquivo\n4 - Deletar arquivo\n*----------------------------------------*\n");
            int menu = scan.nextInt();
            scan.nextLine();
            System.out.println("Digite o nome do arquivo");
            String nomeArquivo = scan.nextLine();
            nomeArquivo = nomeArquivo.concat(".txt");
            String path = "C:\\Users\\livia\\Documents\\Unichristus\\S2\\LIP1\\".concat(nomeArquivo);

            File meuArquivo = new File(path);
            switch (menu){
                case 1:
                    if (meuArquivo.createNewFile()) {
                        System.out.println("Arquivo criado com sucesso! Arquivo: " + meuArquivo.getName());
                    } else {
                        System.out.println("arquivo já existe");
                    }
                    break;
                case 2:
                    try {
                        FileWriter escrever = new FileWriter(path, true);

                        System.out.println("Digite seu nome, telefone e e-mail");
                        String nome = scan.nextLine();
                        String telefone = scan.nextLine();
                        String email = scan.nextLine();

                        escrever.write("nome: " + nome + "\n");
                        escrever.write("telefone: " + telefone + "\n");
                        escrever.write("e-mail: " + email + "\n");
                        escrever.write("\n");
                        escrever.close();

                        System.out.println("escrito com sucesso");

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    Scanner leitor = new Scanner(meuArquivo);
                    while(leitor.hasNextLine()){
                        String data = leitor.nextLine();
                        System.out.println(data);
                    }
                    leitor.close();
                    break;
                case 4:
                    if (meuArquivo.delete()) {
                        System.out.println("Deleted File: " + meuArquivo.getName());
                    } else {
                        System.out.println("Falha ao deletar o arquivo!");
                    }
                    break;
            }
            System.out.println("deseja continuar? s/n");
            op = scan.nextLine();
        }

    }
}
