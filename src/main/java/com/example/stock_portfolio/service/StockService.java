package com.example.stock_portfolio.service;
import java.util.List;

import com.example.stock_portfolio.dto.StockDto;

public interface StockService {
    StockDto createStock(StockDto stockDto);

    StockDto getStockById(Long stockId);

    List<StockDto> getAllStocks();

    StockDto updateStock(Long stockId, StockDto updatedStock);

    void deleteStock(Long stockId);
}
