public class MinhaClasse {
    public static void main(String[] args) {
        /*String meuNome = "Leandro";
        int anoNascimento = 1990;
        booLean verdadeira = true;
        anoNascimento = 1989;*/

        String primeiroNome = "Leandro";
        String segundoNome = "Matos";

        String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
