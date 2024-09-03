
public class Main {
    public static void main(String[] args) {
        // Criando e configurando um objeto Funcionario
        Funcionario f1 = new Funcionario();
        f1.setNome("Doni");
        f1.setCpf("44444.3333.4");
        f1.setSalario(2000);
        System.out.println("---------------------------");
        System.out.println("Funcionario:");
        System.out.println("Nome: " + f1.getNome());
        System.out.println("CPF: " + f1.getCpf());
        System.out.println("Salário: " + f1.getSalario());
        System.out.println("---------------------------");

        // Criando e configurando um objeto Gerente
        Gerente g1 = new Gerente();
        g1.setNome("Pedro");
        g1.setCpf("52324242");
        g1.setSalario(2500);
        g1.setSenha(2222);
        
        System.out.println("Gerente:");
        System.out.println("Nome: " + g1.getNome());
        System.out.println("CPF: " + g1.getCpf());
        System.out.println("Salário: " + g1.getSalario());
        System.out.println("Autenticação (senha 2222): " + g1.autentica(2222));
        System.out.println("---------------------------");
        
        // Criando e configurando um objeto Coordenador
        Coordenador c1 = new Coordenador();
        c1.setNome("Coord");
        c1.setCpf("32323232");
        c1.setSalario(3600);
        
        System.out.println("Coordenador:");
        System.out.println("Nome: " + c1.getNome());
        System.out.println("CPF: " + c1.getCpf());
        System.out.println("Salário: " + c1.getSalario());
        System.out.println("---------------------------");
        
        // Criando e usando o ControleBonificacao
        ControleBonificacao control = new ControleBonificacao();
        control.registra(f1);
        control.registra(g1);
        control.registra(c1);
        
        System.out.println("Gastos com bonificação:");
        System.out.println("Total: " + control.getSoma());
    }
}
