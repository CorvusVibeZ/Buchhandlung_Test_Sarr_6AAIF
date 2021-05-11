package at.itkollegimst.sarr.pos1makro.test2.buchbestellungsms.domain.model.valueobjects;

import javax.persistence.Embeddable;

@Embeddable
public enum Bestellstatus {

   NICHT_BESTELLT, BESTELLT, ABHOLBEREIT;
}
