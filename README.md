Android-DatePicker-Sample
====

このリポジトリは、
DatePicker の表示形式が boolean で定義されているために
Lollipop (API Level 21) で追加された表示形式に対応できなくなった
(属性を増やすことで無理やり対応した)
Android らしさを感じていただくために用意されたリポジトリです。

## Description
`android:calendarViewShown="true|false"` from API Level 11

`android:spinnersShown="true|false"` from API Level 11

`android:datePickerMode="spinner|calendar"` from API Level 21

## Decision Table

||1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|
|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|
|DatePickerMode|Calendar|Calendar|Calendar|Calendar|Calendar|Calendar|Calendar|Calendar|Spinner|Spinner|Spinner|Spinner|Spinner|Spinner|Spinner|Spinner|Spinner|Spinner|Spinner|Spinner|Calendar|Calendar|Calendar|Calendar|Calendar|Calendar|Calendar|Calendar|Spinner|Spinner|Spinner|Spinner|Spinner|Spinner|Spinner|Spinner|Spinner|Spinner|Spinner|Spinner|
|isCalendarViewShown|false|false|false|false|true|true|true|true|false|false|false|false|false|false|true|true|true|true|true|true|false|false|false|false|true|true|true|true|false|false|false|false|false|false|true|true|true|true|true|true|
|isSpinnersShown|false|false|true|true|false|false|true|true|false|false|false|true|true|true|false|false|false|true|true|true|false|false|true|true|false|false|true|true|false|false|false|true|true|true|false|false|false|true|true|true|
|Activity|AppCompatActivity|AppCompatActivity|AppCompatActivity|AppCompatActivity|AppCompatActivity|AppCompatActivity|AppCompatActivity|AppCompatActivity|AppCompatActivity|AppCompatActivity|AppCompatActivity|AppCompatActivity|AppCompatActivity|AppCompatActivity|AppCompatActivity|AppCompatActivity|AppCompatActivity|AppCompatActivity|AppCompatActivity|AppCompatActivity|FragmentActivity|FragmentActivity|FragmentActivity|FragmentActivity|FragmentActivity|FragmentActivity|FragmentActivity|FragmentActivity|FragmentActivity|FragmentActivity|FragmentActivity|FragmentActivity|FragmentActivity|FragmentActivity|FragmentActivity|FragmentActivity|FragmentActivity|FragmentActivity|FragmentActivity|FragmentActivity|
|Theme|Theme.AppCompat|Theme.Holo|Theme.AppCompat|Theme.Holo|Theme.AppCompat|Theme.Holo|Theme.AppCompat|Theme.Holo|Theme.AppCompat|Theme.Black|Theme.Holo|Theme.AppCompat|Theme.Black|Theme.Holo|Theme.AppCompat|Theme.Black|Theme.Holo|Theme.AppCompat|Theme.Black|Theme.Holo|Theme.AppCompat|Theme.Holo|Theme.AppCompat|Theme.Holo|Theme.AppCompat|Theme.Holo|Theme.AppCompat|Theme.Holo|Theme.AppCompat|Theme.Black|Theme.Holo|Theme.AppCompat|Theme.Black|Theme.Holo|Theme.AppCompat|Theme.Black|Theme.Holo|Theme.AppCompat|Theme.Black|Theme.Holo|
|Screenshot|![DatePickerInAppCompatActivity_Calendar_isCalendarViewShown_false_isSpinnersShown_false_Theme_AppCompat.png](./screenshots/DatePickerInAppCompatActivity_Calendar_isCalendarViewShown_false_isSpinnersShown_false_Theme_AppCompat.png)|![DatePickerInAppCompatActivity_Calendar_isCalendarViewShown_false_isSpinnersShown_false_Theme_Holo.png](./screenshots/DatePickerInAppCompatActivity_Calendar_isCalendarViewShown_false_isSpinnersShown_false_Theme_Holo.png)|![DatePickerInAppCompatActivity_Calendar_isCalendarViewShown_false_isSpinnersShown_true_Theme_AppCompat.png](./screenshots/DatePickerInAppCompatActivity_Calendar_isCalendarViewShown_false_isSpinnersShown_true_Theme_AppCompat.png)|![DatePickerInAppCompatActivity_Calendar_isCalendarViewShown_false_isSpinnersShown_true_Theme_Holo.png](./screenshots/DatePickerInAppCompatActivity_Calendar_isCalendarViewShown_false_isSpinnersShown_true_Theme_Holo.png)|![DatePickerInAppCompatActivity_Calendar_isCalendarViewShown_true_isSpinnersShown_false_Theme_AppCompat.png](./screenshots/DatePickerInAppCompatActivity_Calendar_isCalendarViewShown_true_isSpinnersShown_false_Theme_AppCompat.png)|![DatePickerInAppCompatActivity_Calendar_isCalendarViewShown_true_isSpinnersShown_false_Theme_Holo.png](./screenshots/DatePickerInAppCompatActivity_Calendar_isCalendarViewShown_true_isSpinnersShown_false_Theme_Holo.png)|![DatePickerInAppCompatActivity_Calendar_isCalendarViewShown_true_isSpinnersShown_true_Theme_AppCompat.png](./screenshots/DatePickerInAppCompatActivity_Calendar_isCalendarViewShown_true_isSpinnersShown_true_Theme_AppCompat.png)|![DatePickerInAppCompatActivity_Calendar_isCalendarViewShown_true_isSpinnersShown_true_Theme_Holo.png](./screenshots/DatePickerInAppCompatActivity_Calendar_isCalendarViewShown_true_isSpinnersShown_true_Theme_Holo.png)|![DatePickerInAppCompatActivity_Spinner_isCalendarViewShown_false_isSpinnersShown_false_Theme_AppCompat.png](./screenshots/DatePickerInAppCompatActivity_Spinner_isCalendarViewShown_false_isSpinnersShown_false_Theme_AppCompat.png)|![DatePickerInAppCompatActivity_Spinner_isCalendarViewShown_false_isSpinnersShown_false_Theme_Black.png](./screenshots/DatePickerInAppCompatActivity_Spinner_isCalendarViewShown_false_isSpinnersShown_false_Theme_Black.png)|![DatePickerInAppCompatActivity_Spinner_isCalendarViewShown_false_isSpinnersShown_false_Theme_Holo.png](./screenshots/DatePickerInAppCompatActivity_Spinner_isCalendarViewShown_false_isSpinnersShown_false_Theme_Holo.png)|![DatePickerInAppCompatActivity_Spinner_isCalendarViewShown_false_isSpinnersShown_true_Theme_AppCompat.png](./screenshots/DatePickerInAppCompatActivity_Spinner_isCalendarViewShown_false_isSpinnersShown_true_Theme_AppCompat.png)|![DatePickerInAppCompatActivity_Spinner_isCalendarViewShown_false_isSpinnersShown_true_Theme_Black.png](./screenshots/DatePickerInAppCompatActivity_Spinner_isCalendarViewShown_false_isSpinnersShown_true_Theme_Black.png)|![DatePickerInAppCompatActivity_Spinner_isCalendarViewShown_false_isSpinnersShown_true_Theme_Holo.png](./screenshots/DatePickerInAppCompatActivity_Spinner_isCalendarViewShown_false_isSpinnersShown_true_Theme_Holo.png)|![DatePickerInAppCompatActivity_Spinner_isCalendarViewShown_true_isSpinnersShown_false_Theme_AppCompat.png](./screenshots/DatePickerInAppCompatActivity_Spinner_isCalendarViewShown_true_isSpinnersShown_false_Theme_AppCompat.png)|![DatePickerInAppCompatActivity_Spinner_isCalendarViewShown_true_isSpinnersShown_false_Theme_Black.png](./screenshots/DatePickerInAppCompatActivity_Spinner_isCalendarViewShown_true_isSpinnersShown_false_Theme_Black.png)|![DatePickerInAppCompatActivity_Spinner_isCalendarViewShown_true_isSpinnersShown_false_Theme_Holo.png](./screenshots/DatePickerInAppCompatActivity_Spinner_isCalendarViewShown_true_isSpinnersShown_false_Theme_Holo.png)|![DatePickerInAppCompatActivity_Spinner_isCalendarViewShown_true_isSpinnersShown_true_Theme_AppCompat.png](./screenshots/DatePickerInAppCompatActivity_Spinner_isCalendarViewShown_true_isSpinnersShown_true_Theme_AppCompat.png)|![DatePickerInAppCompatActivity_Spinner_isCalendarViewShown_true_isSpinnersShown_true_Theme_Black.png](./screenshots/DatePickerInAppCompatActivity_Spinner_isCalendarViewShown_true_isSpinnersShown_true_Theme_Black.png)|![DatePickerInAppCompatActivity_Spinner_isCalendarViewShown_true_isSpinnersShown_true_Theme_Holo.png](./screenshots/DatePickerInAppCompatActivity_Spinner_isCalendarViewShown_true_isSpinnersShown_true_Theme_Holo.png)|![DatePickerInFragmentActivity_Calendar_isCalendarViewShown_false_isSpinnersShown_false_Theme_AppCompat.png](./screenshots/DatePickerInFragmentActivity_Calendar_isCalendarViewShown_false_isSpinnersShown_false_Theme_AppCompat.png)|![DatePickerInFragmentActivity_Calendar_isCalendarViewShown_false_isSpinnersShown_false_Theme_Holo.png](./screenshots/DatePickerInFragmentActivity_Calendar_isCalendarViewShown_false_isSpinnersShown_false_Theme_Holo.png)|![DatePickerInFragmentActivity_Calendar_isCalendarViewShown_false_isSpinnersShown_true_Theme_AppCompat.png](./screenshots/DatePickerInFragmentActivity_Calendar_isCalendarViewShown_false_isSpinnersShown_true_Theme_AppCompat.png)|![DatePickerInFragmentActivity_Calendar_isCalendarViewShown_false_isSpinnersShown_true_Theme_Holo.png](./screenshots/DatePickerInFragmentActivity_Calendar_isCalendarViewShown_false_isSpinnersShown_true_Theme_Holo.png)|![DatePickerInFragmentActivity_Calendar_isCalendarViewShown_true_isSpinnersShown_false_Theme_AppCompat.png](./screenshots/DatePickerInFragmentActivity_Calendar_isCalendarViewShown_true_isSpinnersShown_false_Theme_AppCompat.png)|![DatePickerInFragmentActivity_Calendar_isCalendarViewShown_true_isSpinnersShown_false_Theme_Holo.png](./screenshots/DatePickerInFragmentActivity_Calendar_isCalendarViewShown_true_isSpinnersShown_false_Theme_Holo.png)|![DatePickerInFragmentActivity_Calendar_isCalendarViewShown_true_isSpinnersShown_true_Theme_AppCompat.png](./screenshots/DatePickerInFragmentActivity_Calendar_isCalendarViewShown_true_isSpinnersShown_true_Theme_AppCompat.png)|![DatePickerInFragmentActivity_Calendar_isCalendarViewShown_true_isSpinnersShown_true_Theme_Holo.png](./screenshots/DatePickerInFragmentActivity_Calendar_isCalendarViewShown_true_isSpinnersShown_true_Theme_Holo.png)|![DatePickerInFragmentActivity_Spinner_isCalendarViewShown_false_isSpinnersShown_false_Theme_AppCompat.png](./screenshots/DatePickerInFragmentActivity_Spinner_isCalendarViewShown_false_isSpinnersShown_false_Theme_AppCompat.png)|![DatePickerInFragmentActivity_Spinner_isCalendarViewShown_false_isSpinnersShown_false_Theme_Black.png](./screenshots/DatePickerInFragmentActivity_Spinner_isCalendarViewShown_false_isSpinnersShown_false_Theme_Black.png)|![DatePickerInFragmentActivity_Spinner_isCalendarViewShown_false_isSpinnersShown_false_Theme_Holo.png](./screenshots/DatePickerInFragmentActivity_Spinner_isCalendarViewShown_false_isSpinnersShown_false_Theme_Holo.png)|![DatePickerInFragmentActivity_Spinner_isCalendarViewShown_false_isSpinnersShown_true_Theme_AppCompat.png](./screenshots/DatePickerInFragmentActivity_Spinner_isCalendarViewShown_false_isSpinnersShown_true_Theme_AppCompat.png)|![DatePickerInFragmentActivity_Spinner_isCalendarViewShown_false_isSpinnersShown_true_Theme_Black.png](./screenshots/DatePickerInFragmentActivity_Spinner_isCalendarViewShown_false_isSpinnersShown_true_Theme_Black.png)|![DatePickerInFragmentActivity_Spinner_isCalendarViewShown_false_isSpinnersShown_true_Theme_Holo.png](./screenshots/DatePickerInFragmentActivity_Spinner_isCalendarViewShown_false_isSpinnersShown_true_Theme_Holo.png)|![DatePickerInFragmentActivity_Spinner_isCalendarViewShown_true_isSpinnersShown_false_Theme_AppCompat.png](./screenshots/DatePickerInFragmentActivity_Spinner_isCalendarViewShown_true_isSpinnersShown_false_Theme_AppCompat.png)|![DatePickerInFragmentActivity_Spinner_isCalendarViewShown_true_isSpinnersShown_false_Theme_Black.png](./screenshots/DatePickerInFragmentActivity_Spinner_isCalendarViewShown_true_isSpinnersShown_false_Theme_Black.png)|![DatePickerInFragmentActivity_Spinner_isCalendarViewShown_true_isSpinnersShown_false_Theme_Holo.png](./screenshots/DatePickerInFragmentActivity_Spinner_isCalendarViewShown_true_isSpinnersShown_false_Theme_Holo.png)|![DatePickerInFragmentActivity_Spinner_isCalendarViewShown_true_isSpinnersShown_true_Theme_AppCompat.png](./screenshots/DatePickerInFragmentActivity_Spinner_isCalendarViewShown_true_isSpinnersShown_true_Theme_AppCompat.png)|![DatePickerInFragmentActivity_Spinner_isCalendarViewShown_true_isSpinnersShown_true_Theme_Black.png](./screenshots/DatePickerInFragmentActivity_Spinner_isCalendarViewShown_true_isSpinnersShown_true_Theme_Black.png)|![DatePickerInFragmentActivity_Spinner_isCalendarViewShown_true_isSpinnersShown_true_Theme_Holo.png](./screenshots/DatePickerInFragmentActivity_Spinner_isCalendarViewShown_true_isSpinnersShown_true_Theme_Holo.png)|

## Licence

    Copyright 2015 wada811

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

## Author

[wada811](https://github.com/wada811)