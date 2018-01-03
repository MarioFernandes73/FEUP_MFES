package StackOverflow;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Date {
  public Number year;
  public Number month;
  public Number day;

  public void cg_init_Date_1(final Number y, final Number m, final Number d) {

    year = y;
    month = m;
    day = d;
  }

  public Date(final Number y, final Number m, final Number d) {

    cg_init_Date_1(y, m, d);
  }

  public static Number DaysOfMonth(final Number m) {

    Boolean orResult_1 = false;

    if (Utils.equals(m, 1L)) {
      orResult_1 = true;
    } else {
      Boolean orResult_2 = false;

      if (Utils.equals(m, 3L)) {
        orResult_2 = true;
      } else {
        Boolean orResult_3 = false;

        if (Utils.equals(m, 5L)) {
          orResult_3 = true;
        } else {
          Boolean orResult_4 = false;

          if (Utils.equals(m, 7L)) {
            orResult_4 = true;
          } else {
            Boolean orResult_5 = false;

            if (Utils.equals(m, 8L)) {
              orResult_5 = true;
            } else {
              Boolean orResult_6 = false;

              if (Utils.equals(m, 10L)) {
                orResult_6 = true;
              } else {
                orResult_6 = Utils.equals(m, 12L);
              }

              orResult_5 = orResult_6;
            }

            orResult_4 = orResult_5;
          }

          orResult_3 = orResult_4;
        }

        orResult_2 = orResult_3;
      }

      orResult_1 = orResult_2;
    }

    if (orResult_1) {
      return 31L;

    } else {
      if (Utils.equals(m, 2L)) {
        return 28L;

      } else {
        return 30L;
      }
    }
  }

  public Date() {}

  public static Boolean compareDates(final Date date1, final Date date2) {

    if (date1.year.longValue() > date2.year.longValue()) {
      return true;

    } else {
      Boolean andResult_24 = false;

      if (Utils.equals(date1.year, date2.year)) {
        if (date1.month.longValue() > date2.month.longValue()) {
          andResult_24 = true;
        }
      }

      if (andResult_24) {
        return true;

      } else {
        Boolean andResult_25 = false;

        if (Utils.equals(date1.year, date2.year)) {
          Boolean andResult_26 = false;

          if (Utils.equals(date1.month, date2.month)) {
            if (date1.day.longValue() > date2.day.longValue()) {
              andResult_26 = true;
            }
          }

          if (andResult_26) {
            andResult_25 = true;
          }
        }

        if (andResult_25) {
          return true;

        } else {
          return false;
        }
      }
    }
  }

  public String toString() {

    return "Date{"
        + "year := "
        + Utils.toString(year)
        + ", month := "
        + Utils.toString(month)
        + ", day := "
        + Utils.toString(day)
        + "}";
  }
}
