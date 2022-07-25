package designprojetos.service;

import designprojetos.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {

  //usando a busca via http do java
//  public String buscarCep(String url) {
//    try {
//      URI endereco = URI.create(url);
//      HttpClient client = HttpClient.newHttpClient();
//      HttpRequest request = HttpRequest.newBuilder(endereco).GET().build();
//      HttpResponse<String> response = client.send(request,
//              HttpResponse.BodyHandlers.ofString());
//      String body = response.body();
//      return body;
//    } catch (Exception exception) {
//      throw new RuntimeException(exception);
//    }
//  }
//  String url = "https://viacep.com.br/ws";

  @GetMapping("/{cep}/json/")
  Endereco consultaCep(@PathVariable("cep") String cep);
}
