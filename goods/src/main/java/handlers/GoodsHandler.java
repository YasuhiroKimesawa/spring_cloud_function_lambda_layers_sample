package handlers;

import models.Goods;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@Component("goods")
public class GoodsHandler implements java.util.function.Function<Flux<Goods>, Flux<Goods>>
{
    @Override
    public Flux<Goods> apply(Flux<Goods> goodsFlux)
    {
        Goods goods = goodsFlux.blockFirst();

        return goodsFlux.flatMap(input -> Flux.just(goods));
    }
}
