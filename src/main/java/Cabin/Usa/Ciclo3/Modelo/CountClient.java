
package Cabin.Usa.Ciclo3.Modelo;

import lombok.Data;

@Data
public class CountClient {
    private Long Total;
    private Cliente Client;

    public CountClient(Long Total, Cliente Client) {
        this.Total = Total;
        this.Client = Client;
    }
    
}
