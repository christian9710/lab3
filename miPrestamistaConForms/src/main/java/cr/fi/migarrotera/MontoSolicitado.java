package cr.fi.migarrotera;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class MontoSolicitado implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        String nombre = (String) delegateExecution.getVariable("nombre");
        String apellido = (String) delegateExecution.getVariable("apellido");
        String empleado = (String) delegateExecution.getVariable("empleado");
        String ingresos = (String) delegateExecution.getVariable("ingresosMensuales");


    }
}
