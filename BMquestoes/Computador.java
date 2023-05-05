public class Computador extends Equipamento {
    private String sistemaOperacional;
    private String processador;
    public Computador(String marca, String modelo, String sistemaOperacional, String processador) {
        super(marca, modelo);
        this.sistemaOperacional = sistemaOperacional;
        this.processador = processador;
    }
    public String getSistemaOperacional() {
        return sistemaOperacional;
    }
    public String getProcessador() {
        return processador;
    }
}