public class main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Rafael", "Rua 10", "(11) 99999-2222", "2344"); 
        System.out.printf(aluno.toString());
        Professor professor = new Professor ("Thayani", "Rua 3", "(11) 98888-2222", "ΤΡΑ"); 
        System.out.printf(professor.toString());
        //Interface não tem construtor e não pode ser instanciado
        //Pessoa pessoa = new Pessoa();
        Pessoa pessoa = new Professor ("Thayani", "Rua 3", "(11) 98888-2222", "ΤΡΑ");
    
        pessoa = new Aluno ("Rafael", "Rua 10", "(11) 99999-2222", "2344");
        System.out.printf(pessoa.toString());
    }
}
