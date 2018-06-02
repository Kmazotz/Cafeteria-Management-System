using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Data.Common;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DataServices.Connectors
{
    public abstract class DBConnector
    {
        protected string Server { get; set; }
        protected string DataBase { get; set; }
        protected int Port { get; set; }
        protected string User { get; set; }
        protected string Password { get; set; }

        public DBConnector(string server, string dataBase, int port, string user, string password)
        {
            Server = server;
            DataBase = dataBase;
            Port = port;
            User = user;
            Password = password;
        }

        public virtual string CreateConnection()
        {
            DbConnectionStringBuilder connection = new DbConnectionStringBuilder(true);
            connection.Add("Server", Server);
            connection.Add("Database", DataBase);
            connection.Add("Port", Port);
            connection.Add("User", User);
            connection.Add("Password", Password);
            return connection.ConnectionString;
        }

        public abstract bool OpenConnection();

        public abstract bool CloseConnection();

        public abstract IEnumerable<string> SelectQuery(string table, string fields);

        public abstract IEnumerable<string> SelectAllQuery(string table);

        public abstract void InsertQuery(string table, string fields, string values);

        public abstract void UpdateQuery(string table, string values);

        public abstract void DeleteQuery(string table);

        public abstract T ExecuteFunction<T>(string func, params string[] parameters);

        public abstract void ExecuteProcedure<T>(string proc, out T returns, params string[] parameters);
    }
}
