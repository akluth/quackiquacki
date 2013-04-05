quackiquacki - text-to-speech and speech recognition PoC
===============

## Goal

QuackiQuacki or quackiquacki is primary a proof-of-concept. It's goal is to provide the ability to navigate through the web and on websites only with your speech and to transform the content on websites, especially "Web 2.0" websites and web applications, to natural speech.

It'll contain a learning database where QuackiQuacki will recognize different page structures to provide a better result when intepreting the content of the website.

The goal is to provide a useful tool for blind and other handicapped people which can surf the web and use AJAX-apps with nothing more then their speech.

It's heavily inspired by "Saria", a tool for controlling the PC and executing simple tasks via your speech, written by [Papierkorb](http://github.com/papierkorb).

Currently it is under heavy development.


## Usage

Clone the Repo, download [Leiningen](http://leiningen.org) and execute 

       lein trampoline run --prompt

in the root of the directory.

Enter 
        :?

to get a full list of commands. To get f.e. the title of a webpage, enter `:get-title http://google.de`.


## License

Copyright (C) 2013 Alexander Kluth

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
