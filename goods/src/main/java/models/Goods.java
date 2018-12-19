package models;

public class Goods
{
    private GoodsId goodsId;

    public Goods(GoodsId goodsId)
    {
        this.goodsId = goodsId;
    }

    public GoodsId getGoodsId()
    {
        return goodsId;
    }

    public void setGoodsId(GoodsId goodsId)
    {
        this.goodsId = goodsId;
    }

    public Goods()
    {
    }
}
