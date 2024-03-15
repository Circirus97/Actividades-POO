public class EmpleadoTemporal extends Empleado{

    private String fechaFinContrato;

    public EmpleadoTemporal(String nombre, int edad, String fechaFinContrato) {
        super(nombre, edad);
        this.fechaFinContrato = fechaFinContrato;
    }

    public String getFechaFinContrato() {
        return fechaFinContrato;
    }

    public void setFechaFinContrato(String fechaFinContrato) {
        this.fechaFinContrato = fechaFinContrato;
    }

    @Override
    public String toString() {
        return "EmpleadoTemporal{" +
                "fechaFinContrato='" + fechaFinContrato + '\'' +
                '}';
    }
}
