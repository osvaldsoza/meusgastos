package br.com.monktec.meusgastos.service;

import br.com.monktec.meusgastos.entity.Gasto;
import br.com.monktec.meusgastos.entity.GastoRequest;
import br.com.monktec.meusgastos.repository.GastoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class GastoService {

    @Autowired
    private GastoRepository gastoRepository;

    public List<Gasto> todos() {
        return gastoRepository.findAll();
    }


    public List<Gasto> novoGasto(GastoRequest gastoRequest) {

        var gastos = new ArrayList<Gasto>();

        var dataVencimento = gastoRequest.getDataVencimento();

        for (int i = 0; i < gastoRequest.getQtdeParcela(); i++) {

            gerarParcelas(gastoRequest, dataVencimento, i);

            var gasto = new Gasto();

            BeanUtils.copyProperties(gastoRequest, gasto, "id", "qtdeParcela");

            gastos.add(gasto);
        }

        return gastoRepository.saveAll(gastos);
    }

    private void gerarParcelas(GastoRequest gastoRequest, LocalDate data, int i) {
        LocalDate dataVencimento = LocalDate.of(
                data.getYear(),
                data.getMonth(),
                data.getDayOfMonth());

        gastoRequest.setDataVencimento(dataVencimento.plusMonths(i));
    }
}
