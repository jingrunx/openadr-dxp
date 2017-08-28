package cn.openadr.model;

import java.util.List;

import cn.openadr.model.target.Market;

/** Virtual Top Node */
public class VTN extends DRObject {
	private static final long serialVersionUID = 1L;

	private Market market;
	private List<VEN> vens;

	public Market getMarket() {
		return market;
	}

	public void setMarket(Market market) {
		this.market = market;
	}

	public List<VEN> getVens() {
		return vens;
	}

	public void setVens(List<VEN> vens) {
		this.vens = vens;
	}
}
