package reto3;

public class Empleado extends Persona2 {
    private String cargo;
    private double valorHora;
    private double horasTrabajadas;
    private String departamento;

    public Empleado(String tipoDocumento, String numeroDocumento, String nombres, String apellidos, String cargo, double valorHora, double horasTrabajadas2, String departamento) {
        super(tipoDocumento, numeroDocumento, nombres, apellidos);
        this.cargo = cargo;
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas2;
        this.departamento = departamento;
    }

    public String getCargo() {
        return cargo;
    }

    public double getValorHora() {
        return valorHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double calcularHonorarios() {
        double total = valorHora * horasTrabajadas;
        double reteica = total * 0.00966;
        return total - reteica;
    }

    public void imprimirInformacion() {
        System.out.println(getTipoDocumento() + " " + getNumeroDocumento() + " - " + getNombres() + " " + getApellidos());
        System.out.println("Cargo: " + cargo);
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Valor por hora: " + valorHora);
        System.out.println("Total a pagar: " + calcularHonorarios());
    }
}