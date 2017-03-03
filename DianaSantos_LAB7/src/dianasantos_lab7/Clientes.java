
package dianasantos_lab7;


public class Clientes {
    private String ticket;
    private int dinero;
    private String status;

    public Clientes() {
    }

    public Clientes(String ticket, int dinero, String status) {
        this.ticket = ticket;
        this.dinero = dinero;
        this.status = status;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
