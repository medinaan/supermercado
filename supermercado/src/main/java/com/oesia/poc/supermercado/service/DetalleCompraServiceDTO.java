import com.oesia.poc.supermercado.model.DetalleCompra;
import com.oesia.poc.supermercado.model.DetalleCompraDTO;
import com.oesia.poc.supermercado.repository.DetalleCompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DetalleCompraService {

    @Autowired
    private DetalleCompraRepository detalleCompraRepository;
    public List<DetalleCompraDTO> getHistorialComprasUsuario(String clienteId) {
        List<DetalleCompra> detallesCompra = detalleCompraRepository.findByClienteId(clienteId);
        return convertirADTO(detallesCompra);
    }

    // Otros métodos según sea necesario

    private List<DetalleCompraDTO> convertirADTO(List<DetalleCompra> detallesCompra) {
        // Lógica para convertir DetalleCompra a DetalleCompraDTO
        // Puedes utilizar librerías de mapeo como ModelMapper si es necesario
        // O simplemente crear instancias de DetalleCompraDTO y asignar manualmente los valores

        // Ejemplo simplificado:
        return detallesCompra.stream()
                .map(detalle -> new DetalleCompraDTO(detalle.getCantidad(), detalle.getPrecioTotal(), detalle.getPrecioUnidad(), /* Otros campos */))
                .collect(Collectors.toList());
    }
}
