package models;

import javax.validation.constraints.NotEmpty;

public class GoodsId
{
    @NotEmpty
    private Integer value;

    public GoodsId(Integer value)
    {
        this.value = value;
    }

    public Integer getValue()
    {
        return value;
    }

    public void setValue(Integer value)
    {
        this.value = value;
    }

    public GoodsId()
    {
    }
}
