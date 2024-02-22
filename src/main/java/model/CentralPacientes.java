package model;

public class CentralPacientes {
    public int numPacientes;
    public Paciente primero;

    public CentralPacientes(int numPacientes) {
        this.numPacientes = numPacientes;
    }

    public void agregarPaciente(int searchValue, int value){
        Paciente currentNode = primero;

        while(currentNode != null){
            if(currentNode.getCodigo() == searchValue){
                Paciente newNode = new Paciente(value);
                Paciente nextNode = currentNode.getSiguiente();
                currentNode.setSiguiente(newNode);
                newNode.setSiguiente(nextNode);
            }
            currentNode = currentNode.getSiguiente();
        }
    }
    public void buscarPaciente(int i){

    }
    public void eliminarPaciente(int i){

    }
}
