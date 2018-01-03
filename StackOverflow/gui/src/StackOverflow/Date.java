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

  public static Number DaysOfMonth(final Number month_1) {

    Boolean orResult_3 = false;

    if (Utils.equals(month_1, 1L)) {
      orResult_3 = true;
    } else {
      Boolean orResult_4 = false;

      if (Utils.equals(month_1, 3L)) {
        orResult_4 = true;
      } else {
        Boolean orResult_5 = false;

        if (Utils.equals(month_1, 5L)) {
          orResult_5 = true;
        } else {
          Boolean orResult_6 = false;

          if (Utils.equals(month_1, 7L)) {
            orResult_6 = true;
          } else {
            Boolean orResult_7 = false;

            if (Utils.equals(month_1, 8L)) {
              orResult_7 = true;
            } else {
              Boolean orResult_8 = false;

              if (Utils.equals(month_1, 10L)) {
                orResult_8 = true;
              } else {
                orResult_8 = Utils.equals(month_1, 12L);
              }

              orResult_7 = orResult_8;
            }

            orResult_6 = orResult_7;
          }

          orResult_5 = orResult_6;
        }

        orResult_4 = orResult_5;
      }

      orResult_3 = orResult_4;
    }

    if (orResult_3) {
      return 31L;

    } else {
      if (Utils.equals(month_1, 2L)) {
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
      Boolean andResult_97 = false;

      if (Utils.equals(date1.year, date2.year)) {
        if (date1.month.longValue() > date2.month.longValue()) {
          andResult_97 = true;
        }
      }

      if (andResult_97) {
        return true;

      } else {
        Boolean andResult_98 = false;

        if (Utils.equals(date1.year, date2.year)) {
          Boolean andResult_99 = false;

          if (Utils.equals(date1.month, date2.month)) {
            if (date1.day.longValue() > date2.day.longValue()) {
              andResult_99 = true;
            }
          }

          if (andResult_99) {
            andResult_98 = true;
          }
        }

        if (andResult_98) {
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
