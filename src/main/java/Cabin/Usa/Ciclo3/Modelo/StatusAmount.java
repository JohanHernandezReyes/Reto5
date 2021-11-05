
package Cabin.Usa.Ciclo3.Modelo;

import lombok.Data;

@Data
public class StatusAmount {
    private int completed;
    private int cancelled;

    public StatusAmount(int completed, int cancelled) {
        this.completed = completed;
        this.cancelled = cancelled;
    }
    
}
