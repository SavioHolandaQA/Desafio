import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fluxodecompra {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://muuitosabor.com.br/cadastro");
        driver.manage().window().maximize();

        // Cenário 1: Cadastro com Sucesso
        driver.findElement(By.id("nome")).sendKeys("Sávio");
        driver.findElement(By.id("sobrenome")).sendKeys("QA");
        driver.findElement(By.id("telefone")).sendKeys("85990909090");
        driver.findElement(By.id("email")).sendKeys("qa@example.com");
        driver.findElement(By.id("senha")).sendKeys("Senha123");
        driver.findElement(By.id("cadastrar")).click();

        if (!driver.getCurrentUrl().contains("login")) {
            System.out.println("FALHA: Não foi para a página de login após cadastro");
        }

        // Cenário 2: Login com Sucesso
        driver.findElement(By.id("email")).sendKeys("qa@example.com");
        driver.findElement(By.id("senha")).sendKeys("Senha123");
        driver.findElement(By.id("entrar")).click();

        if (!driver.getCurrentUrl().contains("Bem-vindo")) {
            System.out.println("FALHA: Login não redirecionou corretamente");
        }

        // Cenário 3: Busca de Produto com sucesso
        driver.findElement(By.id("campobusca")).sendKeys("carne bovina");
        driver.findElement(By.id("buscar")).click();
        driver.findElement(By.id("produto520")).click();

        if (!driver.getCurrentUrl().contains("produto520")) {
            System.out.println("FALHA: Não abriu a página do produto");
        }

        // Cenário 4: PDP Adicionar Produto ao Carrinho com sucesso
        driver.findElement(By.id("adicionarAoCarrinho")).click();

        if (!driver.getCurrentUrl().contains("carrinho")) {
            System.out.println("FALHA: Não avançou para o carrinho");
        }

        // Cenário 5: Carrinho avança na compra do produto
        driver.findElement(By.id("comprar")).click();

        if (!driver.getCurrentUrl().contains("checkout")) {
            System.out.println("FALHA: Não avançou para checkout");
        }

        // Cenário 6: Preenchimento do Endereço no Checkout
        driver.findElement(By.id("cep")).sendKeys("12345-678");
        driver.findElement(By.id("logradouro")).sendKeys("Rua Exemplo");
        driver.findElement(By.id("numero")).sendKeys("123");
        driver.findElement(By.id("avancar")).click();

        if (!driver.getCurrentUrl().contains("pagamento")) {
            System.out.println("FALHA: Não avançou para pagamento");
        }

        // Cenário 7: Pagamento com pix
        try {
            if (driver.findElement(By.id("qrcode-pix")).isDisplayed()) {
                driver.findElement(By.id("finalizarCompra")).click();
                System.out.println("Compra finalizada com sucesso!");
            } else {
                System.out.println("FALHA: QR Code do PIX não apareceu");
            }
        } catch (Exception e) {
            System.out.println("ERRO: Falha no processo de pagamento PIX");
        }
        driver.quit();
    }
}