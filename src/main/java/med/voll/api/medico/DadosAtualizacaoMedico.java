package med.voll.api.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.DadosEndereco;
import med.voll.api.endereco.Endereco;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
    public DadosAtualizacaoMedico(Medico medico)
    {
        this(medico.getId(), medico.getNome(), medico.getTelefone(), new Endereco(medico.getEndereco()));
    }

}
