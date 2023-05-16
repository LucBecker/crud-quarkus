import com.github.database.rider.cdi.api.DBRider;
import com.github.database.rider.core.api.dataset.DataSet;
import com.github.lucasba.Produto;
import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
import org.junit.Assert;

@DBRider
@QuarkusTest
@QuarkusTestResource(DatabaseLifeCycle.class)
public class ProdutoTest {

    @Test
    @DataSet("produtos1.yml")
    public void testUm(){
        Assert.assertEquals(1, Produto.count());

    }
}
