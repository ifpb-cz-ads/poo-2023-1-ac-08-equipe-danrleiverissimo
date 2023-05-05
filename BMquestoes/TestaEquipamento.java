public class TestaEquipamento {
    public static void main(String[] args) {
        Equipamento equipamento = new Equipamento("Sony", "XYZ123");
        Computador computador = new Computador("Dell", "Inspiron 5000", "Windows 10", "Intel Core i5");

        System.out.println("Informações do Equipamento:");
        System.out.println("Marca: " + equipamento.getMarca());
        System.out.println("Modelo: " + equipamento.getModelo());

        System.out.println("\nInformações do Computador:");
        System.out.println("Marca: " + computador.getMarca());
        System.out.println("Modelo: " + computador.getModelo());
        System.out.println("Sistema Operacional: " + computador.getSistemaOperacional());
        System.out.println("Processador: " + computador.getProcessador());
    }
}